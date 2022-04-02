package id.ac.uin.student.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty(message = "First name is required")
    @NotNull(message = "First name can not be null!!")
    @Column(nullable = false, name = "first_name")
    private String firstName;

    @NotEmpty(message = "Last name is required")
    @NotNull(message = "Last name can not be null!!")
    @Column(nullable = false, name = "last_name")
    private String lastName;

    @NotNull(message = "Please enter birth date")
    @Past(message = "Birth date should be less than current date!!")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate birthDate;

    @NotEmpty(message = "Email is required")
    @Email
    @Column(nullable = true, name = "email", unique = true)
    private String email;

    @NotEmpty(message = "Phone number is required")
    @NotNull(message = "Phone number cn not be null!!")
    @Size(max = 13, min = 10, message = "Phone number should be of 10 digits!!")
    @Column(nullable = true, unique = true)
    private String phoneNumber;

    @NotEmpty(message = "Jurusan is required")
    @Column(nullable = false, unique = true)
    private String jurusan;

}
