/**
 * Copyright 2004-2048 .
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ipd.jsf.gd.config;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Title: 最基本的config，包含Id字段<br>
 * <p/>
 * Description: <br>
 * <p/>
 */
public abstract class AbstractIdConfig extends AbstractConfig {

    /**
     * Id生成器
     */
    private final static AtomicInteger ID_GENERATOR = new AtomicInteger(0);

    /**
     * Spring的BeanId
     */
    protected String id;

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        if (id == null) {
            id = "jsf-cfg-gen-" + ID_GENERATOR.getAndIncrement();
        }
        return id;
    }

    /**
     * Sets id.
     *
     * @param id  the id
     */
    public void setId(String id) {
        this.id = id;
    }

}