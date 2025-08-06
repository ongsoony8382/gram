package kr.co.wikibook.greengram.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class UserFollow extends CreatedAt{

    @EmbeddedId
    private UserFollowIds userFollowIds;

    //관계 설정
    @MapsId("fromUserId") // EmbeddedId의 필드명
    @ManyToOne
    @JoinColumn(name = "from_user_id", nullable = false)
    private User fromUser;

    @MapsId("toUserId")
    @ManyToOne
    @JoinColumn(name = "to_user_id", nullable = false)
    private User toUser;






}
