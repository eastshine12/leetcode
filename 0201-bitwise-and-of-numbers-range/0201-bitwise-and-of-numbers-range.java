class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        
        int cnt = 0;
        while (left != right) {
            left >>= 1;
            right >>= 1;
            cnt++;
        }
        return (left << cnt);
    }
}


/*
GPT 설명

1. left와 right는 주어진 범위의 양 끝 값을 나타냅니다. 예를 들어, left가 5이고 right가 7이라면 범위는 5부터 7까지입니다.
2. cnt는 반복 횟수를 나타내는 변수로, 초기값은 0입니다.
3. left와 right가 서로 다를 때까지 반복문을 실행합니다. 이는 left와 right의 최하위 비트부터 하나씩 오른쪽으로 이동하며 비교하는 과정입니다.
4. 각 반복에서 left와 right를 오른쪽으로 1 비트씩 이동시킵니다. 이는 현재 비트를 비교한 후 더 이상 해당 비트를 고려하지 않기 위한 목적입니다. 이동된 후의 값은 left와 right를 2로 나눈 결과와 같습니다.
5. cnt를 1 증가시킵니다. 이는 현재까지 비트 이동한 횟수를 나타냅니다.
6. left와 right가 서로 같아지면 반복문을 종료합니다. 이는 left와 right의 모든 비트를 비교하고 동일한 값을 가질 때까지 이동한 것을 의미합니다.
7. left를 cnt만큼 왼쪽으로 이동시킵니다. 이는 비트 이동한 횟수만큼 다시 왼쪽으로 이동시켜 원래 위치로 되돌리는 과정입니다.
8. left를 반환합니다. 이는 주어진 범위 내의 모든 숫자들을 비트 단위로 AND 연산하여 얻은 결과입니다.

*/