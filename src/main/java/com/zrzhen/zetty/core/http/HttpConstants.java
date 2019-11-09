/*
 * Copyright 2012 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.zrzhen.zetty.core.http;


import java.nio.charset.Charset;

/**
 * @author chenanlian
 * <p>
 * 参考netty
 */
public final class HttpConstants {

    /**
     * Horizontal space
     */
    public static final byte SP = 32;

    /**
     * Horizontal tab
     */
    public static final byte HT = 9;

    /**
     * Carriage return
     */
    public static final byte CR = 13;

    /**
     * Equals '='
     */
    public static final byte EQUALS = 61;

    /**
     * Line feed character
     */
    public static final byte LF = 10;


    /**
     * carriage return line feed
     */
    public static final byte[] CRLF = new byte[]{CR, LF};

    public static final String CRLF_STRING = "\r\n";

    /**
     * Colon ':'
     */
    public static final byte COLON = 58;

    /**
     * COLON_SP
     */
    public static final byte[] COLON_SP = new byte[]{COLON, SP};

    public static final String COLON_SP_STRING = ": ";

    /**
     * Semicolon ';'
     */
    public static final byte SEMICOLON = 59;

    /**
     * Comma ','
     */
    public static final byte COMMA = 44;

    /**
     * Double quote '"'
     */
    public static final byte DOUBLE_QUOTE = '"';

    /**
     * Default character set (UTF-8)
     */
    public static final Charset DEFAULT_CHARSET = CharsetUtil.UTF_8;

    /**
     * Horizontal space
     */
    public static final char SP_CHAR = (char) SP;

    private HttpConstants() {
        // Unused
    }
}
