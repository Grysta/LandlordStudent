package com.grysta.crud.dao;

import com.grysta.crud.bean.MeetingDate;
import com.grysta.crud.bean.MeetingDateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingDateMapper {
    long countByExample(MeetingDateExample example);

    int deleteByExample(MeetingDateExample example);

    int deleteByPrimaryKey(Integer dateId);

    int insert(MeetingDate record);

    int insertSelective(MeetingDate record);

    List<MeetingDate> selectByExample(MeetingDateExample example);

    MeetingDate selectByPrimaryKey(Integer dateId);

    int updateByExampleSelective(@Param("record") MeetingDate record, @Param("example") MeetingDateExample example);

    int updateByExample(@Param("record") MeetingDate record, @Param("example") MeetingDateExample example);

    int updateByPrimaryKeySelective(MeetingDate record);

    int updateByPrimaryKey(MeetingDate record);
}