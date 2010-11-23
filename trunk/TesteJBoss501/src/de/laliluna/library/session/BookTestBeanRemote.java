package de.laliluna.library.session;

import javax.ejb.Remote;

import de.laliluna.library.entity.UsuariosVO;

@Remote
public interface BookTestBeanRemote
{

	public int somaRemote (int x, int y);

	public void test ();

	public UsuariosVO update (UsuariosVO vo) throws Exception;
}
