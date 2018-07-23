package com.otus.spring.service.impl

import com.otus.spring.service.CsvResourceService

import spock.lang.Specification

class CsvResourceServiceImplSpec extends Specification {

    CsvResourceService csvService

    void setup() {
        csvService = new CsvServiceImpl()
        assert csvService != null
    }

    def "getQuizList() method returns ArrayList reference type"() {
        expect:
        csvService.quizList.getClass() in ArrayList.class
    }
}
