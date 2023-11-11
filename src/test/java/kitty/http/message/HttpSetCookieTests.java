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

/**
 * @author Julian Jupiter
 */
class HttpSetCookieTests {
    @Test
    void createHttpSetCookie() {
        var setCookie = new HttpSetCookie("location", "PH")
                .domain("localhost")
                .maxAge(5000L);
        Assertions.assertEquals("location", setCookie.name());
        Assertions.assertEquals("PH", setCookie.value());
        Assertions.assertEquals(HttpSetCookie.SameSite.NONE, setCookie.sameSite());
        Assertions.assertEquals(
                "location=PH; domain=localhost; path=/; maxAge=5000; size=2; httpOnly=false; secure=true; sameSite=None; partitioned=false",
                setCookie.toString()
        );
    }
}
