package com.asana.requests;

import com.asana.Client;
import com.asana.resources.Resource;
import com.google.api.client.http.*;
import com.google.common.io.CharStreams;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public abstract class Request
{
    public String method;
    public String path;

    public Map<String,Object> data;
    public Map<String,Object> query;
    public Map<String,Object> options;
    public HttpContent content;

    protected Client client;
    protected Class elementClass; // required due to type erasure?

    public Request(Resource resource, Class elementClass, String path, String method)
    {
        this.client = resource.client;
        this.elementClass = elementClass;

        this.path = path;
        this.method = method;
        this.content = null;

        this.data = new HashMap<String,Object>();
        this.query = new HashMap<String,Object>();
        this.options = new HashMap<String,Object>();

        this.options.putAll(this.client.options);
    }

    public Request query(Map<String, Object> query)
    {
        this.query = query;
        return this;
    }

    public Request query(String key, Object value)
    {
        this.query.put(key, value);
        return this;
    }

    public Request data(HttpContent content)
    {
        this.content = content;
        return this;
    }

    public Request data(Map<String, Object> data)
    {
        this.data = data;
        return this;
    }

    public Request data(String key, Object value)
    {
        this.data.put(key, value);
        return this;
    }

    public Request option(String key, Object value)
    {
        this.options.put(key, value);
        return this;
    }

    public InputStream logContent(InputStream stream)
    {
        try {
            String text = CharStreams.toString(new InputStreamReader(stream));
            System.out.println("!!! < " + text);
            return new ByteArrayInputStream(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
            return stream;
        }
    }
}
