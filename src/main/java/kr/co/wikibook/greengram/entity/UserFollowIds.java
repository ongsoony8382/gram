package kr.co.wikibook.greengram.entity;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@Embeddable //포함될 수 있는
@AllArgsConstructor
@NoArgsConstructor
public class UserFollowIds implements Serializable { //복합키 역할의 class는 Serializable을 implements해야 한다.
    private long fromUserId;
    private long toUserId;
}
