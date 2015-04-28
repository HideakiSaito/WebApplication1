/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.session;

import jpa.entity.ZVUserSkill;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author macuser
 */
@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ZVUserSkillFacade extends AbstractFacade<ZVUserSkill> {

    @PersistenceContext(unitName = "WebApplication1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ZVUserSkillFacade() {
        super(ZVUserSkill.class);
    }

}
