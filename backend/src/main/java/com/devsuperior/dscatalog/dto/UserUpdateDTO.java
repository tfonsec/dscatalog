package com.devsuperior.dscatalog.dto;

import com.devsuperior.dscatalog.services.validation.UserUpdateValid;

//este pacote terá tudo que o userDTO tem



@UserUpdateValid // verificão se o e-mail que estou inserindo já existe no banco
public class UserUpdateDTO extends UserDTO {
	   private static final long serialVersionUID = 1L;
	   
}