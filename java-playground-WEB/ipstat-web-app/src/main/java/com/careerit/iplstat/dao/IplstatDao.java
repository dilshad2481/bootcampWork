package com.careerit.iplstat.dao;

import java.util.List;

import com.careerit.iplstat.dto.TeamStatDto;

public interface IplstatDao {
	public List<String> selectTeamNames();
	public List<TeamStatDto> selectTeamStats();
}
