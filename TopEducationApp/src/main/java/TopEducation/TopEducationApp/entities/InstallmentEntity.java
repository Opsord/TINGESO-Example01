package TopEducation.TopEducationApp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "installments")
@Data
@NoArgsConstructor
@AllArgsConstructor

// Part of the persistence layer
public class InstallmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    // RUT associated with the installment
    private String installmentRUT;

    // Installment amount
    private int installmentAmount;

    // Installment status: 0 -> Pending, 1 -> Paid
    private int installmentStatus;

    // Installment payment date
    private LocalDate installmentPaymentDate;

}
