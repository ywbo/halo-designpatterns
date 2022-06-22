package com.ilearning.design.mediator;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * 读取资源类
 *
 * @author yuwenbo
 * @date 2022/6/23 6:43
 **/
public class Resources {

    public static Reader getResourceAsReader(String resource) throws IOException {
        return new InputStreamReader(getResourceAsStream(resource));
    }

    private static InputStream getResourceAsStream(String resource) throws IOException {
        ClassLoader[] classLoaders = getClassLoaders();
        for (ClassLoader classLoader : classLoaders) {
            InputStream stream = classLoader.getResourceAsStream(resource);
            if (null != stream) {
                return stream;
            }
        }
        throw new IOException("Could not find resource " + resource);
    }

    private static ClassLoader[] getClassLoaders() {
        return new ClassLoader[]{
                ClassLoader.getSystemClassLoader(), Thread.currentThread().getContextClassLoader()
        };
    }

}
