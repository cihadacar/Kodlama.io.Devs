package kodlama.io.kodlamaiodevs.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "sub_technologies")
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class SubTechnology {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
}
