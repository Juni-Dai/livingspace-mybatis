package cn.juni.dao;

import java.util.List;

import cn.juni.pojo.Daily;

public interface IDaily {

	public int insertDaily(Daily daily);

	public List<Daily> getAllDaily();
	
	public List<Daily> getAllDailyByPage(int pageIndex,int pageSize);
	
	public int getCount();
	
	public int delDailyById(String[] dids);
	
	public Daily getDescById(int did);
}
