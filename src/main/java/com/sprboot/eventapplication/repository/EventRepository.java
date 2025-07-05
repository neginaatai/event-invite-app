package com.sprboot.eventapplication.repository;

import com.sprboot.eventapplication.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository <Event, Long>{

}
