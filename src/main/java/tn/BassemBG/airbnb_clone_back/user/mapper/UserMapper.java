package tn.BassemBG.airbnb_clone_back.user.mapper;

import org.mapstruct.Mapper;
import tn.BassemBG.airbnb_clone_back.user.application.dto.ReadUserDTO;
import tn.BassemBG.airbnb_clone_back.user.domain.Authority;
import tn.BassemBG.airbnb_clone_back.user.domain.User;

@Mapper(componentModel = "spring")
public interface UserMapper {


    ReadUserDTO userToReadUserDTO(User user);

    default String mapAuthoritiesToString(Authority authority){
        return authority.getName();
    }




}
