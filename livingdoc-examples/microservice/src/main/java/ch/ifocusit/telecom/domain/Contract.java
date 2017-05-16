/*
 * Living Documentation
 *
 * Copyright (C) 2017 Focus IT
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package ch.ifocusit.telecom.domain;

import ch.ifocusit.livingdoc.annotations.Glossary;
import ch.ifocusit.telecom.domain.common.AbstractDomain;
import lombok.Data;

import java.time.LocalDate;
import java.time.MonthDay;

/**
 * Telecom contract
 */
@Glossary(id = 200)
@Data
public class Contract extends AbstractDomain {

    /**
     * Contract identifier.
     * Generate by the system and communicate to client.
     */
    @Glossary(id = 201)
    private String id;

    /**
     * Contract customer.
     */
    @Glossary(id = 300)
    private Customer customer;

    /**
     * Contract effect date.
     */
    @Glossary(id = 202)
    private LocalDate effectDate;

    /**
     * Extract birth day from effect date.
     *
     * @return the contract birth date
     */
    @Glossary(id = 203)
    public MonthDay getBirthDay() {
        return MonthDay.from(effectDate);
    }
}