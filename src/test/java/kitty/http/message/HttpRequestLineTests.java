/*
 * Copyright 2013-2023 Julian Jupiter.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package kitty.http.message;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.net.URI;

/**
 * @author Julian Jupiter
 */
class HttpRequestLineTests {
    @Test
    void createHttpRequestLine() {
        var target = URI.create("/users");
        var requestLine = new HttpRequestLine(HttpMethod.GET, target, HttpVersion.HTTP_1_1);
        Assertions.assertEquals(HttpMethod.GET, requestLine.method());
        Assertions.assertEquals(URI.create("/users"), requestLine.target());
        Assertions.assertEquals(HttpVersion.HTTP_1_1, requestLine.version());
        Assertions.assertEquals("GET /users HTTP/1.1", requestLine.toString());
    }
}
