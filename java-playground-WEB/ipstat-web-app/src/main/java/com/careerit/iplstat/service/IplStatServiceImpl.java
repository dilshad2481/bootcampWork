package com.careerit.iplstat.service;
import java.util.List;

import com.careerit.iplstat.dao.IplstatDao;
import com.careerit.iplstat.dao.IplstatDaoImpl;
import com.careerit.iplstat.dto.TeamStatDto;

public class IplStatServiceImpl implements IplStatService {

	private IplstatDao obj = IplstatDaoImpl.getInstance();

	@Override
	public List<String> getTeamNames() {
		List<String> list = obj.selectTeamNames();
		System.out.println("Total team names count is :" + list.size());
		return list;
	}

	@Override
	public List<TeamStatDto> getTeamStats() {
		List<TeamStatDto> list = obj.selectTeamStats();
		System.out.println("Teams count is :" + list.size());
		return list;
	}

}