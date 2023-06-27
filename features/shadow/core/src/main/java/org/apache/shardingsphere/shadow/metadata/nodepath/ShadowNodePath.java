/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.shadow.metadata.nodepath;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.shardingsphere.infra.metadata.nodepath.RuleNodePath;

import java.util.Arrays;
import java.util.Collections;

/**
 * Shadow node path.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ShadowNodePath {
    
    public static final String DATA_SOURCES = "data_sources";
    
    public static final String TABLES = "tables";
    
    public static final String ALGORITHMS = "algorithms";
    
    public static final String DEFAULT_ALGORITHM = "default_algorithm_name";
    
    private static final RuleNodePath INSTANCE = new RuleNodePath("shadow", Arrays.asList(DATA_SOURCES, TABLES, ALGORITHMS), Collections.singleton(DEFAULT_ALGORITHM));
    
    /**
     * Get instance of rule node path.
     *
     * @return got instance
     */
    public static RuleNodePath getInstance() {
        return INSTANCE;
    }
}
