/*
 * Copyright 2013 Bruno Oliveira, and individual contributors
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.abstractj.kalium.crypto;

import org.abstractj.kalium.NaCl.Sodium;

import static org.abstractj.kalium.NaCl.SODIUM_INSTANCE;

public class Random {

    private static final Sodium sodium = SODIUM_INSTANCE;
    private static final int DEFAULT_SIZE = 32;

    /**
     * Generate random bytes
     *
     * @param n number or random bytes
     * @return
     */
    public static byte[] randomBytes(int n) {
        byte[] buffer = new byte[n];
        sodium.randombytes(buffer, n);
        return buffer;
    }

    public static byte[] randomBytes() {
        byte[] buffer = new byte[DEFAULT_SIZE];
        sodium.randombytes(buffer, DEFAULT_SIZE);
        return buffer;
    }
}
