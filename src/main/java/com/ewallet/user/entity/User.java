package com.ewallet.user.entity;

import com.ewallet.user.enums.Gender;
import com.ewallet.user.enums.Role;
import com.ewallet.user.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "address", columnDefinition = "TEXT")
    private String address;

    @Column(name = "nid_number")
    private String nidNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Role role;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private Gender gender;

    @Column(name = "photo_url")
    private String photoUrl;

    @Column(name = "nid_photo_url")
    private String nidPhotoUrl;

    @Enumerated(EnumType.STRING)
    @Column(name = "account_status")
    private Status status;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "approved_at")
    private LocalDateTime ApprovedAt; // LocalDateTime

    @OneToOne
    @JoinColumn(name = "approved_by", referencedColumnName = "id")
    private Admin approvedBy;

    @OneToMany(mappedBy = "user")
    private List<BankAccountDetails> bankAccountDetails;

    @OneToMany(mappedBy = "user")
    private List<CardDetails> cardDetails;

    @OneToMany(mappedBy = "user")
    private List<TransactionHistory> transactionHistory;

}
