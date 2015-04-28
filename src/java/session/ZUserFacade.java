/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.ZSkill;
import entity.ZUser;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

/**
 *
 * @author macuser
 */
@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ZUserFacade extends AbstractFacade<ZUser> {

    @PersistenceContext(unitName = "WebApplication1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ZUserFacade() {
        super(ZUser.class);
    }

    @Resource
    private UserTransaction ut;

    /**
     * user and skill edit
     *
     * @param zuser
     * @throws java.lang.Exception
     */
    public void myEdit(ZUser zuser) throws Exception {
        try {
            ut.begin();

            getEntityManager().merge(zuser);

            ZSkill zskill;
            zskill = getEntityManager().find(ZSkill.class, zuser.getId());
            zskill.setSubscription("EJB on Change!");
            getEntityManager().merge(zskill);

            ut.commit();
        } catch (NotSupportedException | SystemException | RollbackException | HeuristicMixedException | HeuristicRollbackException | SecurityException | IllegalStateException e) {
            ut.rollback();
        }

    }

}
