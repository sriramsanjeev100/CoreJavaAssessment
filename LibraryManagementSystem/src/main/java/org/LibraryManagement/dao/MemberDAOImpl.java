package org.LibraryManagement.dao;
import org.LibraryManagement.entity.Member;

public class MemberDAOImpl extends AbstractGenericDAO<Member, Integer> implements MemberDAO
{
    public MemberDAOImpl()
    {
        super(Member.class);
    }
}