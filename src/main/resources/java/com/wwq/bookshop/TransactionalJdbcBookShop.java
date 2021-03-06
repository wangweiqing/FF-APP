package com.wwq.bookshop;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class TransactionalJdbcBookShop extends JdbcDaoSupport implements
		BookShop {

	private PlatformTransactionManager transactionManager;
	
	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	@Override
	public void purchase(final String isbn, final String username) {
		// TODO Auto-generated method stub
/*		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		try {
			int price = getJdbcTemplate().queryForInt(
					"SELECT PRICE FROM BOOK WHERE ISBN = ?",
					new Object[] { isbn });
			getJdbcTemplate().update(
					"UPDATE BOOK_STOCK SET STOCK = STOCK -1 "
							+ "WHERE ISBN = ?",
					new Object[] { isbn });
			getJdbcTemplate().update(
					"UPDATE ACCOUNT SET BALANCE = BALANCE - ? "
							+ "WHERE USERNAME = ?",
					new Object[] { price, username });
			transactionManager.commit(status);
		} catch (DataAccessException e) {
			transactionManager.rollback(status);
			throw e;
		}*/
		TransactionTemplate transactionTemplate = new TransactionTemplate(
				transactionManager);
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			protected void doInTransactionWithoutResult(TransactionStatus status) {
				int price = getJdbcTemplate().queryForInt(
						"SELECT PRICE FROM BOOK WHERE ISBN = ?",
						new Object[] { isbn });
				getJdbcTemplate().update(
						"UPDATE BOOK_STOCK SET STOCK = STOCK - 1 "
								+ "WHERE ISBN = ?", new Object[] { isbn });
				getJdbcTemplate().update(
						"UPDATE ACCOUNT SET BALANCE = BALANCE - ? "
								+ "WHERE USERNAME = ?",
						new Object[] { price, username });
			}
		});

	}

}
