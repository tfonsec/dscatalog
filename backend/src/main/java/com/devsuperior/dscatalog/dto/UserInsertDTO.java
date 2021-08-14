package com.devsuperior.dscatalog.dto;

import com.devsuperior.dscatalog.services.validation.UserInsertValid;

//este pacote terá tudo que o userDTO tem



@UserInsertValid
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
