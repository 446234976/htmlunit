/*
 * Copyright (c) 2002-2013 Gargoyle Software Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gargoylesoftware.htmlunit.protocol.data;

import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

/**
 * Stream handler for data URLs.
 *
 * @version $Revision: 7931 $
 * @author Marc Guillemot
 */
public class Handler extends URLStreamHandler {
    /**
     * Returns a new URLConnection for this URL.
     * @param url the JavaScript URL
     * @return the connection
     */
    @Override
    protected URLConnection openConnection(final URL url) {
        return new DataURLConnection(url);
    }
}