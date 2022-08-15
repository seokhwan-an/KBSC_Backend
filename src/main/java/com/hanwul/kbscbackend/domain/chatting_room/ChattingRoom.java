package com.hanwul.kbscbackend.domain.chatting_room;

import com.hanwul.kbscbackend.domain.chattingmessage.ChattingMessage;
import com.hanwul.kbscbackend.domain.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "ChattingRooms")
public class ChattingRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String description;

    @ManyToOne(targetEntity = User.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "from_id")
    private User constructor;

    @ManyToOne(targetEntity = User.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "to_id")
    private User participant;

    @OneToMany(mappedBy = "chattingroom", cascade = CascadeType.ALL)
    private List<ChattingMessage> MessageList;
}
