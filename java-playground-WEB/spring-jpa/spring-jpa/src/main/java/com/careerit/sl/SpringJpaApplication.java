package com.careerit.sl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.careerit.sl.domain.TeamDetails;
import com.careerit.sl.dto.TeamDto;
import com.careerit.sl.repo.PlayerRepo;
import com.careerit.sl.repo.TeamDetailsRepo;

@SpringBootApplication
public class SpringJpaApplication implements CommandLineRunner {
	@Autowired //inject PlayerRepo
	private PlayerRepo playerRepo;
	@Autowired
	private TeamDetailsRepo teamDetailsRepo;
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// quickly test your application
//		Player player = Player.builder()
//				.name("Dhoni")
//				.role("WC")
//				.country("IND")
//				.teamCode("CSK")
//				.price(17000000)
//				.build();
		//Save this object into database
		//Saved object is returned and saved in player
//		player = playerRepo.save(player);
//		System.out.println(player.getPid());		
//		List<Player> playerList = getPlayers();
//		System.out.println(playerList.size());
//		playerRepo.saveAll(playerList);
		//get DTO
//		TeamDto teamDto = TeamDto.builder()
//								.teamCode("MI")
//								.teamName("Mumbai Indians")
//								.build();
//		//Convert DTO into Domain Object
//		TeamDetails teamDetails = new TeamDetails();
//		teamDetails.setTeamCode(teamDto.getTeamCode());
//		teamDetails.setTeamName(teamDto.getTeamName());
//		teamDetailsRepo.save(teamDetails);
		
	}
	
//	private List<Player> getPlayers(){
//		List<Player> playerList = new ArrayList<Player>();
//		try {
//			List<String> lines = Files.readAllLines(Paths.get(getClass().getResource("/ipl_player_data.csv").toURI()));
//			playerList=lines.stream().skip(1).map(line -> convertToPlayer(line)).collect(Collectors.toList());
//		} catch(IOException | URISyntaxException e) {
//			e.printStackTrace();
//		}
//		return playerList;
//	}
//
//	private Player convertToPlayer(String line) {
//		String[] arr = line.split(",");
//		String name = arr[0];
//		String role = arr[1];
//		double price = Double.parseDouble(arr[2]);
//		String country = arr[3];
//		String teamCode = arr[4];
//		Player player = Player.builder().name(name).role(role).price(price)
//				.teamCode(teamCode).country(country).build();
//		return player;
//	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
