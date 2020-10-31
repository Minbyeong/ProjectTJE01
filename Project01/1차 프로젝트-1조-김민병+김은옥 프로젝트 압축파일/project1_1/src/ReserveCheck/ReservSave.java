package ReserveCheck;

import java.io.FileWriter;
import java.io.IOException;

public class ReservSave {

	public void save(ReservFile file) {

		try {
			FileWriter w = new FileWriter(file.id + ".txt"); //해당 형식으로 파일에 저장을 하기 위해서 지정.
			w.write("예매자: " + file.id + "\n");
			w.write("예매번호: " + file.reserv_num + "\n");
			w.write("영화제목: " + file.subject + "\n");
			w.write("영화관: " + file.region + "\n");
			w.write("날짜: " + file.date + "\n");
			w.write("상영관번호: " + file.room_num + "\n");
			w.write("상영시작시간: " + file.time + "\n");
			w.write("예매좌석: " + file.seat_num + "\n");
			w.close();
		} catch (IOException e) {
			System.out.println("파일 저장 에러 발생");
			e.printStackTrace();
		}
	}
}
