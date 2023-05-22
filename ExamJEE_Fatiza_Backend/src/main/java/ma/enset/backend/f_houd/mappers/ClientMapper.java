package ma.enset.backend.f_houd.mappers;

import ma.enset.backend.f_houd.dtos.ClientDto;
import ma.enset.backend.f_houd.entities.Client;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class ClientMapper {
    public ClientDto fromClient(Client client){
        ClientDto clientDto=new ClientDto();
        BeanUtils.copyProperties(client,clientDto);
        return  clientDto;
    }
    public Client fromClientDto(ClientDto clientDto){
        Client client=new Client();
        BeanUtils.copyProperties(clientDto,client);
        return  client;
    }
}
