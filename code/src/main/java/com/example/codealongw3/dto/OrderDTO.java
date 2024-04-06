package com.example.codealongw3.dto;
import com.example.codealongw3.models.CustomUser;
import com.example.codealongw3.models.Game;

import java.time.LocalDateTime;
import java.util.List;
public class OrderDTO {

    public List<Long> product_id;

    public String user_email;

    public OrderDTO(List<Long> product_id, String user_email) {
        this.product_id = product_id;
        this.user_email = user_email;
    }


}
