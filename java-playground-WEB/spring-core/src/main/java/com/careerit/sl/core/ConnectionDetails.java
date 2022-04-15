package com.careerit.sl.core;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Data
public class ConnectionDetails {
	private String url;
	private String username;
	private String password;

}
