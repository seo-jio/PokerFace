package pokerface.pokerface.domain.member.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pokerface.pokerface.global.BaseTime;
import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor
public class Member extends BaseTime {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id", nullable = false)
    private Long id;

    private String email;

    private String nickname;

    private String userPassword;

    private Integer rating;

    @Enumerated(EnumType.STRING)
    private Tier tier;

    private String socialType;

    private String socialId;

    private String refreshToken;

    private String userRole;

    private String status;

    public Member(String email, String nickname, String userPassword){
        this.email = email;
        this.nickname = nickname;
        this.userPassword = userPassword;
    }
}
