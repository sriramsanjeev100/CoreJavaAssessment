package org.LibraryManagement.service;

import org.LibraryManagement.dao.MemberDAO;
import org.LibraryManagement.dao.MemberDAOImpl;
import org.LibraryManagement.entity.Member;

import java.util.List;

public class MemberService
{
    private final MemberDAO memberDAO = new MemberDAOImpl();

    public void createMember(Member member)
    {
        memberDAO.save(member);
    }

    public void updateMember(Member member)
    {
        memberDAO.update(member);
    }

    public void deleteMember(int memberId)
    {
        memberDAO.delete(memberId);
    }

    public Member findMemberById(int memberId)
    {
        return memberDAO.findById(memberId);
    }

    public List<Member> findAllMembers()
    {
        return memberDAO.findAll();
    }
}