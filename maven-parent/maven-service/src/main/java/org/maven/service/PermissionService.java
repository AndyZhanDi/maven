package org.maven.service;


import java.util.List;
import java.util.Map;

import org.maven.beans.PermissionDomain;



public interface PermissionService {
    List<PermissionDomain> getByMap(Map<String, Object> map);

    PermissionDomain getById(Integer id);

    Integer create(PermissionDomain permission);

    int update(PermissionDomain permission);

    int delete(Integer id);

    List<PermissionDomain> getList();

    List<PermissionDomain> getByStudentId(Integer studentId);
}
