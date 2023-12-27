package com.msa.member.framework.jpaadapter;

import com.msa.member.domain.model.Member;
import com.msa.member.domain.model.vo.IDName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    public Optional<Member> findMemberByIdName(IDName idName);

}
