package com.example.websiteclubbackend.Reservation.reservation;

import com.example.websiteclubbackend.Category.category.Category;
import com.example.websiteclubbackend.Product.product.Product;
import com.example.websiteclubbackend.User.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data@Builder
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_reservation;
    private String date_reservation;
    private String start_reservation;
    private String end_reservation;
    private boolean confirmed;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_pdt")
    private Product product;

}
