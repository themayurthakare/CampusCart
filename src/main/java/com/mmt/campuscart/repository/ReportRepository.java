package com.mmt.campuscart.repository;


import com.mmt.campuscart.model.Report;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReportRepository extends MongoRepository<Report, String> {
}
