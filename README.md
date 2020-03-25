# java-chess
체스 게임 구현을 위한 저장소

## Level1. 기능 요구 사항

-[ ] 콘솔 UI에서 체스 게임을 할 수 있는 기능을 구현한다.
-[ ] 1단계는 체스 게임을 할 수 있는 체스판을 초기화한다.
-[ ] 체스판에서 말의 위치 값은 가로 위치는 왼쪽부터 a ~ h이고, 세로는 아래부터 위로 1 ~ 8로 구현한다.


## Level1. 프로그램 실행 결과

```
체스 게임을 시작합니다.
게임 시작은 start, 종료는 end 명령을 입력하세요.
start
RNBQKBNR
PPPPPPPP
........
........
........
........
pppppppp
rnbqkbnr

end
```

## 기능 구현 순서(TDD)

- [x] Position : 각 좌표에 대한 위치 값을 나타내는 클래스 
    - [x] 64개를 미리 생성하여 Map에 캐싱한다.
    - [x] 문자열로 들어온 값과 일치하는 Position 객체를 반환한다.
    - [x] 없는 포지션의 경우 InvalidPositionException 을 반환한다.
    - [x] 입력값이 Null인 경우 예외를 반환한다.
    
- Piece
    - K, Q, R, P, K, B
        - [x] 살아있는지 죽었는지를 상태로 가지고 있다.
        - [x] 각각 포지션을 가지고 있으며, (현재 위치)
        - 갈 수 있는 곳에 대한 정보를 가지고 있다(현재 레벨에서 X)
        - 각각이 다른 점수를 가지고 있다. (현재 레벨에서 X)
        - (이름을 가지고 있다.) --- 
        - [x] 아군인지 적군인지 판단할 수 있다.
        - 각각의 말은 포지션을 이동할 수 있다. (현재 레벨에서 X)
            - 이동 후 갈 수있는 곳에 대한 정보가 초기화된다.

- [x] Pieces를 가지고 있는 White & Black
    - [x] 대문자를 이름으로 갖는 Black
    - [x] 소문자를 이름으로 갖는 White
    - [x] 같은 편인지 아닌지를 반환하는 메서드를 갖는다.
    
- (Player)

- Cell
    - [x] Position과 Piece를 가지며 --> Optional
    - [x] piece.isSameTeam(other piece) 을 통해 아군 적군을 판별한다.
    
- CellFactory
    - Position에서 캐싱해둔 Key값을 바탕으로
    - 1. 빈 판을 생성한다.
    - 2. 룰에 맞게 판을 생성한다.

- Cells
    - List<Cell> 을 가지고 있으며
    - 특정 포지션이 문자열로 들어왔을 때 셀을 탐색하여 적절한 셀을 반환한다.
    - 아군인지 적군인지 판단하는 진입점