package com.holydayzer.api.controllers;

import org.springframework.data.repository.CrudRepository;

public interface HolidayRepository extends CrudRepository<Holiday, String> {
}
