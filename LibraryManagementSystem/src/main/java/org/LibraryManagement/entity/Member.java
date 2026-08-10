package org.LibraryManagement.entity;


import jakarta.persistence.*;   //When all 5 are imported, automatic conversion to *

@Entity
public class Member
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer memberId;

    @Column(nullable = false, length = 100)
    private String memberName;

    @Column(nullable = false, unique = true, length = 15)
    private String phone;

    public Member()
    {
    }

    public Member(String memberName, String phone)
    {
        this.memberName = memberName;
        this.phone = phone;
    }

    public Integer getMemberId()
    {
        return memberId;
    }

    public void setMemberId(Integer memberId)
    {
        this.memberId = memberId;
    }

    public String getMemberName()
    {
        return memberName;
    }

    public void setMemberName(String memberName)
    {
        this.memberName = memberName;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    @Override
    public String toString()
    {
        return "Member ID : " + memberId +
                "\nMember Name : " + memberName +
                "\nPhone : " + phone;
    }
}