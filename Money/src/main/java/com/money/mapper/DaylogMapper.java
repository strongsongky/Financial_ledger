package com.money.mapper;

import java.util.List;

import com.money.domain.DaylogDTO;
import com.money.domain.DetailDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DaylogMapper {

    // 가계부 일별 기록 조회
    public List<DaylogDTO> getDaylogsByUserIdx(Long user_idx);

    // 가계부 일별 기록 추가
    public int insertDaylog(DaylogDTO daylog);

    // 가계부 일별 기록 수정
    public int updateDaylog(DaylogDTO daylog);

    // 가계부 일별 기록 삭제
    public int deleteDaylog(Long daylog_idx);

    // 가계부 상세 정보 조회
    public List<DetailDTO> getDetailsByDaylogIdx(Long daylog_idx);

    // 가계부 상세 정보 추가
    public int insertDetail(DetailDTO detail);

    // 가계부 상세 정보 수정
    public int updateDetail(DetailDTO detail);

    // 가계부 상세 정보 삭제
    public int deleteDetail(Long detail_idx);
}

