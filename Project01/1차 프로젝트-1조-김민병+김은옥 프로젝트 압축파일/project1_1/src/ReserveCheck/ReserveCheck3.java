package ReserveCheck;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Paycheck.Paycheck3;
import Reservation.ReservationDAO;
import Reservation.ReservationVO;
import main.LoginAfter;

import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class ReserveCheck3 extends JFrame {

	public ReserveCheck3(String id, String pw) throws Exception {

		setSize(1000, 800);
		getContentPane().setBackground(SystemColor.textHighlight);
		getContentPane().setLayout(null); // frame 생성.
		setLocationRelativeTo(null); // 창을 가운데서 생성.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 닫으면 프로그램 종료.
		setVisible(true); // 창이 보이게 해주기.

		Reservation.ReservationDAO dao = new ReservationDAO();
		ReservationVO bag_num = dao.num(id); 
		// 방금 예매한 내역을 불러오기 위해서
		// 예매 번호는 자동 증가 값으로 설정이 되어있기 때문에 이전 페이지에서 넘겨 받을 수 없다
		// 사용자의 id값을 이용하여 예매번호를 담아 놓고 있다.
		ReservationVO bag = dao.one(bag_num.getReserv_num()); // 받아온 예매 번호를 이용하여 방금 예약한 내역을 호출

		JPanel p = new JPanel();
		p.setBackground(SystemColor.textHighlight);
		p.setBounds(162, 73, 687, 516);
		getContentPane().add(p);
		p.setLayout(null);

		JLabel l_id = new JLabel("예매 아이디:");
		l_id.setForeground(Color.WHITE);
		l_id.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		l_id.setBounds(6, 6, 178, 63);
		p.add(l_id);

		JLabel l_reserve_num = new JLabel("예매 번호:");
		l_reserve_num.setForeground(Color.WHITE);
		l_reserve_num.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		l_reserve_num.setBounds(6, 69, 178, 63);
		p.add(l_reserve_num);

		JLabel l_subject = new JLabel("영화 제목:");
		l_subject.setForeground(Color.WHITE);
		l_subject.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		l_subject.setBounds(6, 127, 178, 63);
		p.add(l_subject);

		JLabel l_region = new JLabel("영화관 위치:");
		l_region.setForeground(Color.WHITE);
		l_region.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		l_region.setBounds(6, 190, 178, 63);
		p.add(l_region);

		JLabel l_date_1 = new JLabel("상영 날짜:");
		l_date_1.setForeground(Color.WHITE);
		l_date_1.setFont(new Font("Dialog", Font.PLAIN, 25));
		l_date_1.setBounds(6, 253, 178, 63);
		p.add(l_date_1);

		JLabel l_room_num = new JLabel("상영관 번호:");
		l_room_num.setForeground(Color.WHITE);
		l_room_num.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		l_room_num.setBounds(6, 313, 178, 63);
		p.add(l_room_num);

		JLabel l_time = new JLabel("영화 시간:");
		l_time.setForeground(Color.WHITE);
		l_time.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		l_time.setBounds(6, 376, 178, 63);
		p.add(l_time);

		JLabel l_seat_num = new JLabel("좌석 번호:");
		l_seat_num.setForeground(Color.WHITE);
		l_seat_num.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		l_seat_num.setBounds(6, 440, 178, 63);
		p.add(l_seat_num);

		JLabel l_id_1 = new JLabel(bag.getId());
		l_id_1.setForeground(Color.WHITE);
		l_id_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		l_id_1.setBounds(183, 6, 498, 63);
		p.add(l_id_1);

		JLabel l_reserve_num_1 = new JLabel(bag.getReserv_num() + ""); // 호출한 내역을 해당 라벨에 출력해주고 있다.
		l_reserve_num_1.setForeground(Color.WHITE);
		l_reserve_num_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		l_reserve_num_1.setBounds(183, 69, 498, 63);
		p.add(l_reserve_num_1);

		JLabel l_subject_1 = new JLabel(bag.getSubject());
		l_subject_1.setForeground(Color.WHITE);
		l_subject_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		l_subject_1.setBounds(183, 127, 498, 63);
		p.add(l_subject_1);

		JLabel l_region_1 = new JLabel(bag.getRegion());
		l_region_1.setForeground(Color.WHITE);
		l_region_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		l_region_1.setBounds(183, 190, 498, 63);
		p.add(l_region_1);

		JLabel l_date_1_1 = new JLabel(bag.getDate());
		l_date_1_1.setForeground(Color.WHITE);
		l_date_1_1.setFont(new Font("Dialog", Font.PLAIN, 25));
		l_date_1_1.setBounds(183, 253, 498, 63);
		p.add(l_date_1_1);

		JLabel l_room_num_1 = new JLabel(bag.getRoom_num());
		l_room_num_1.setForeground(Color.WHITE);
		l_room_num_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		l_room_num_1.setBounds(183, 313, 498, 63);
		p.add(l_room_num_1);

		JLabel l_time_1 = new JLabel(bag.getTime());
		l_time_1.setForeground(Color.WHITE);
		l_time_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		l_time_1.setBounds(183, 376, 498, 63);
		p.add(l_time_1);

		JLabel l_seat_num_1 = new JLabel(bag.getSeat_num());
		l_seat_num_1.setForeground(Color.WHITE);
		l_seat_num_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		l_seat_num_1.setBounds(183, 440, 498, 63);
		p.add(l_seat_num_1);

		String id1 = bag.getId();
		String subject = bag.getSubject();
		int reserv_num = bag.getReserv_num();
		String region = bag.getRegion();
		String date = bag.getDate();
		String room_num = bag.getRoom_num();
		String time = bag.getTime();
		String seat_num1 = bag.getSeat_num();
		ReservFile file = new ReservFile(id1, subject, reserv_num, region, date, room_num, time, seat_num1); // 텍스트 파일을 생성하기 위해 변수에 담아주고 값을 넘겨 주었다.

		JButton cancle = new JButton("예매취소");
		cancle.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		cancle.setBounds(162, 617, 210, 53);
		getContentPane().add(cancle);
		cancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "예매가 취소되었습니다."); //누르면 취소가 되었다는 사항을 알려준다.
				ReservationDAO dao = new ReservationDAO();
				bag.getReserv_num();
				try {
					dao.delete(bag); //delete문 수행
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				new LoginAfter(id, pw);
			}
		});

		JButton ok = new JButton("예매하기");
		ok.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		ok.setBounds(639, 617, 210, 53);
		getContentPane().add(ok);
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReservSave save = new ReservSave(); //예매하기를 진행하면 예매한 내역을 텍스트 파일로 저장하기 위해서
				save.save(file);
				new Paycheck3(id, pw);
			}
		});

	}
}
