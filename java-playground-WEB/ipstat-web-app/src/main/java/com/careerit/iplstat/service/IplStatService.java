package com.careerit.iplstat.service;

import java.util.List;

import com.careerit.iplstat.dto.TeamStatDto;

public interface IplStatService {
	public List<String> getTeamNames();
	public List<TeamStatDto> getTeamStats();
}
