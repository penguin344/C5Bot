package game;
import alignments.Alignment;
import net.dv8tion.jda.core.entities.User;
import roles.Role;

public class Player {
	
	private User user;
	private Role role;
	private Alignment alignment;
	private boolean isAlive = true;
	private boolean hooked = false;
	
	public Player(User u){
		user = u;
	}
	
	public void setRole(Role r){
		role = r;
	}
	
	public Role getRole(){
		return role;
	}
	
	public void setAlignment(Alignment a){
		alignment = a;
	}
	
	public String getDiscriminator(){
		return user.getDiscriminator();
	}
	
	public boolean isAlive(){
		return isAlive;
	}
	
	public boolean isHooked(){
		return hooked;
	}
	
	public Alignment getAlignment(){
		return alignment;
	}
	
	public boolean isCop(){
		return alignment.equals(Alignment.getAlignment("cop"));
	}
	
	public void privateMessage(String s){
		if(!user.hasPrivateChannel()){
			user.openPrivateChannel().queue();
		}
		user.getPrivateChannel().sendMessage(s).queue();
	}
	
	public void kill(){
		isAlive = false;
	}
	
	public void hook(){
		hooked = true;
	}
}
