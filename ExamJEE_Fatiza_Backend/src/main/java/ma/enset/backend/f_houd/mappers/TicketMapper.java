package ma.enset.backend.f_houd.mappers;

import ma.enset.backend.f_houd.dtos.TicketDto;
import ma.enset.backend.f_houd.entities.Ticket;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class TicketMapper {
    public TicketDto fromTicket(Ticket ticket){
        TicketDto ticketDto=new TicketDto();
        BeanUtils.copyProperties(ticket,ticketDto);
        return  ticketDto;
    }

    public Ticket fromTicketDto(TicketDto ticketDto){
        Ticket ticket=new Ticket();
        BeanUtils.copyProperties(ticketDto,ticket);
        return  ticket;
    }
}
