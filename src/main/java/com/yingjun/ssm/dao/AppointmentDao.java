package com.yingjun.ssm.dao;

import com.yingjun.ssm.entity.Appointment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Maxuemin on 17/4/19.
 */
public interface AppointmentDao {
    public List<Appointment> getAll(@Param("limit")int limit);
}
