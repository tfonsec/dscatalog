package com.devsuperior.dscatalog.dto;
//este pacote terá tudo que o userDTO tem
public class UserInsertDTO extends UserDTO {
	   private static final long serialVersionUID = 1L;
	   
	   private String password;
	   
	   UserInsertDTO() {
		   super();
	   }

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	   
}
